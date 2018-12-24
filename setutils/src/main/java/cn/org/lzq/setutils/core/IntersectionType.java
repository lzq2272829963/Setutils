package cn.org.lzq.setutils.core;

public enum IntersectionType {
	IntersectionBaseOnSet("IntersectionOnSet"),IntersectionBaseOnSort("IntersectionOnSort");
	private String type;
	private IntersectionType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
}
