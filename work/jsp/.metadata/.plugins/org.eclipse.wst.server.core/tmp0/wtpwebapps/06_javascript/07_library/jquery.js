/**
 * jquery 라이브러 기능 구현해 보기
 * 
 * http://javascriptcompressor.com/ JS 작업한 코드를 압축해준다! 코드 작업시 줄띄어쓰기 줄내리기등 으로 인한 트래픽을 줄여준다
 * 
 * http://jsbeautifier.org // 압축된 코드를 원래대로 돌려준다(!!완벽한 복원은 안된다) 
 */

var $ = jquery;

//html 이 존재하면 설정, 존재하지 않으면 첫번째 값을 반환
function jquery(val)
{
	var elements = [];
	
	if(typeof(val) == "function")
	{
		window.onload = val;
		return;
	};
	
	if(val instanceof HTMLElement)
	{
		elements[0] = val;
	} else 
	{
		switch(val.charAt(0))
		{
			case "<" :
				elements[0] = document.createElement(val.substring(1, val.length - 1));
				break;
				
			default : 
				for(let el of document.querySelectorAll(val))
				{
					elements.push(el);
				};
		};
	};	
	
	elements.append = function(tag)
	{
		for(let el of this)
		{
			for(let child of tag)
			{
				el.appendChild(child.cloneNode(true));
			};
			
		};
		return this;
	};
	
	elements.remove = function()
	{
		for(let el of this)
		{
			el.remove();
		};
		return this;
	};
	
	
	elements.html = function (html) {
		
		if(html != undefined)
		{
			for(let el of this)
			{
				el.innerHTML = html;
			};
			
			return this;
		};
		
		
		return this[0].innerHTML;
	};
	
	elements.text = function (msg) {
		
		if(msg != undefined)
		{
			for(let el of this)
			{
				el.innerText = msg;
			};
			return this;
		};
		
		var result = this[0].innerText;
		for(var i = 1; i < this.length; i++)
		{
			result += "\n" + this[i].innerText;
		};
		
		return result;
	};
	
	elements.attr = function(name, value)
	{
		if(typeof(name) == "object")
		{
			for(let el of this)
			{
				for(var key in name)
				{
					el.setAttribute(key, name[key]);
				};
			};
			return this;
		} else 
		{
			if(value != undefined)
			{
				for(let el of this)
				{
					el.setAttribute(name, value);
				};
				return this;
			}; 
			
			return this[0].getAttribute(name);
			
			
		};
		
	};
	
	elements.css = function(name, value)
	{
		if(typeof(name) == "object")
		{
			for(let el of this)
			{
				for(var key in name)
				{
					el.style[key] = name[key];
				};
			};
			return this;
		} else 
		{
			if(value != undefined)
			{
				for(let el of this)
				{
					el.style[name] = value;
				};
				return this;
			}; 
			
			return this[0].style[name];
			
			
		};
		
	};
	
	elements.val = function (value) {
		
		if(value != undefined)
		{
			for(let el of this)
			{
				el.value = value;
			};
			
			return this;
		};
		
		
		return this[0].value;
	};
	
	elements.prop = function (name, value) {
		
		if(value != undefined)
		{
			for(let el of this)
			{
				el[name] = value;
			};
			
			return this;
		};
		
		return this[0][name];
	};
	
	elements.on = function(type, cb)
	{
		for(let el of this)
		{
			el.addEventListener(type, cb);
		};
		return this;
	};
	
	elements.click = function(cb)
	{
		return this.on("click", cb);
	};
	
	elements.focus = function()
	{
		this[0].focus();
		return this;
	};
	
	elements.select = function()
	{
		this[0].select();
		return this;
	};
	
	return elements;
};




