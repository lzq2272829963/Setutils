package cn.org.lzq.factory;

public enum IntersectionType {
	IntersectionBaseOnSet("IntersectionOnSet");
	private String type;
	private IntersectionType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
}
