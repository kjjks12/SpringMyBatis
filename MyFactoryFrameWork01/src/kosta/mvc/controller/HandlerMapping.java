package kosta.mvc.controller;

public class HandlerMapping {

	private static HandlerMapping factory = new HandlerMapping();
	
	private HandlerMapping(){}
	public static HandlerMapping getInstance(){
		return factory;
	}

	
	/**
	 * ��ü�� �����ؼ� ����
	 */
	public Controller createController(String command){
		Controller controller= null;
		if(command.equals("insert")){
			controller= new InsertController();
		}
		else if(command.equals("select")){
			controller = new SelectController();
		}
		
		return controller;
	}
}
