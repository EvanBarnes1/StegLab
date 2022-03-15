import java.awt.Color;

public class PixelPlayground {
 
    public static Picture zeroBlue(Picture p) {
        
        Picture newPic = new Picture(p);

        Pixel [][] pixels = newPic.getPixels2D();

        for(int r = 0; r < pixels.length; r++)
        {
            //finds the row length. V
                for(int c = 0; c<pixels[0].length; c++)
                {
                    pixels[r][c].setBlue(0);

                }



        }
        
        return newPic;

    }

    public static Picture keepOnlyBlue (Picture a){
        Picture myPic = new Picture(a);
        Pixel [][] pixels = myPic.getPixels2D();
        for(int r = 0; r < pixels.length; r++)
        {
            //finds the row length. V
                for(int c = 0; c<pixels[0].length; c++)
                {
                    pixels[r][c].setRed(0);
                    pixels[r][c].setGreen(0);

                }



        }
        return myPic;
    }
    public static Picture negatePicture (Picture a){
        Picture ourPic = new Picture(a);
        Pixel [][] pixels = ourPic.getPixels2D();
        for(int r = 0; r < pixels.length; r++)
        {
            //finds the row length. V
                for(int c = 0; c<pixels[0].length; c++)
                {
                    int numRed=pixels[r][c].getRed();
                    int numGreen=pixels[r][c].getGreen();
                    int numBlue=pixels[r][c].getBlue();
                    pixels[r][c].setRed(255-numRed);
                    pixels[r][c].setGreen(255-numGreen);
                    pixels[r][c].setBlue(255-numBlue);
                }



        }
        return ourPic;
    }





public static void main(String[] args){

 

Picture beachPic = new Picture("beach.jpg");

beachPic.explore();

Picture beachPicNoBlue = zeroBlue(beachPic);

beachPicNoBlue.explore();

Picture beachOnlyBlue = keepOnlyBlue(beachPic);

beachOnlyBlue.explore();

Picture beachNegated = negatePicture(beachPic);

beachNegated.explore();

}
}
 