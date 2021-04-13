class PNGImage extends Image{
	public void parseFile(String fileName) {
		Matrix m = new Matrix();
		imp.doPaint(m);
		System.out.println(fileName + ",格式为PNG.");
	}
