package kosta.mvc.controller;

public class ModelAndView {

	private String path;// �̵� ���(view ����)
	private boolean isRedirect;// false(������ ���� ���ϱ� redierect �϶��� true)�� ����ϰڵ�.

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
