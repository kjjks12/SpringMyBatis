package kosta.mvc.controller;

public class ModelAndView {

	private String path;// 이동 경로(view 정보)
	private boolean isRedirect;// false(포워드 많이 쓰니까 redierect 일때만 true)로 사용하겠따.

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isRedirect() {
		return isRedirect;
	}

	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}

}
