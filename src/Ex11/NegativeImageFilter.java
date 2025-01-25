package Ex11;

public class NegativeImageFilter extends AbstructImageFilter{
	@Override
	public void process(GrayImage img) {
		int width = img.getWidth();
		int height = img.getHeight();
		for(int x=0; x < width; x++) {
			for(int y=0; y < height; y++) {
				int c = img.getGray(x, y);
				c = 255 - c;
				img.setGray(x, y, c);
			}
		}
	}
}
