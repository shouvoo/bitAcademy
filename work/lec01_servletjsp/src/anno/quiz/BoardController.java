package anno.quiz;

public class BoardController 
{
	@RequestMapping(value="/board/list")
	public void list()
	{
		System.out.println("목록 조회용");
	}
	
	@RequestMapping("/board/writeForm")
	public void writeForm()
	{
		System.out.println("글쓰기 폼용");
	}
	
	@RequestMapping("/board/delete")
	public void delete()
	{
		System.out.println("글삭제용");
	}
}
