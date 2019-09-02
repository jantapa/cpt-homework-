public  class Square extends Polygon{
	
	public Square(int nb){

		super(4);
		sides[0] = 2;
		sides[1] =4;
		sides[2] = 6;
		sides[3] = 8;

	}
    
        @Override
        	public void calArea()
	{

		int j=1;
		
		for (int i = 0 ; i< 4 ; i++ ) {
			area = sides[i] * sides[i];
			System.out.println("Area Square "+j+  " is  =  "+area);
  j++;
			
		}
	
	}

	@Override
	public double getArea() {
          

    return area;

     }

}



