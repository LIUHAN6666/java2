import java.util.Arrays;

public class Combining {
        public static void main(String[] args) {
            int[][] imageData = {{100, 90, 255, 80, 70, 255, 60, 50},
                    {255, 10, 5, 255, 10, 5, 255, 255},
                    {255, 255, 255, 0, 255, 255, 255, 75},
                    {255, 60, 30, 0, 30, 60, 255, 255}};

            //First, we want to crop the image down to a 4x6 image, removing the right 2 columns. Declare and initialize a new 2D array of integers with 4 rows and 6 columns called `newImage`.
            int[][] newImage = null;
            newImage = new int[4][6];

            //Now that you have your empty image, use nested **for** loops to copy over the data from the original image to the new image, make sure not to include the cropped out columns.
            int i= 0;
            int j = 0;
            for(i = 0; i < 4; i++) {
                for(j = 0; j < 6; j++){
                    newImage[i][j] =imageData[i][j];
                }
            }

            for(i = 0; i < 4; i++) {
                for (j = 0; j < 6; j++) {
                    if (newImage[i][j] - 50 < 0) {
                        newImage[i][j] = 0;
                    } else {
                        newImage[i][j] = newImage[i][j]-50;
                    }
                }
            }

            System.out.println(Arrays.deepToString(newImage));

        }


            // System.out.println(Arrays.deepToString(newImage));
        }

