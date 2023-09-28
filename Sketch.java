import processing.core.PApplet;

public class Sketch extends PApplet {
	
  // Window size
  public void settings() {
    size(200, 200);
  }

  // Background colour
  public void setup() {
    background(179, 230, 255);
  }

  
  public void draw() {
    // Body of house
    stroke(224, 202, 158);
    fill(224, 202, 159);
    rect((float) (width / 14), (float) (height / 2), (float) (width / (7.0 / 4.0)), (float) (height / (14.0 / 9.0)));

    // Roof
    stroke(96, 41, 41);
    fill(96, 41, 41);
    quad((float) (width / 7.0), (float) (height / (7.0 / 2.0)), (float) (width / (28.0 / 15.0)), (float) (height / (7.0 / 2.0)), (float) (width / (7.0 / 5.0)), (float) (height / (35.0 / 19.0)), 0, (float) (height / (35.0 / 19.0)));

    // Door
    rect((float) (width / (7.0 / 3.0)), (float) (height / (14.0 / 9.0)), (float) (width / 7), (float) (height / (7.0 / 2.0)));

    // Grass
    stroke(74, 186, 93);
    fill(74, 186, 93);
    rect(0, height - (float) (height / 14.0), width, (float) (height / 14.0));

    // Window
    stroke(148, 175, 255);
    fill(148, 175, 255);
    ellipse((float) (width / (14.0/ 3.0)), (float) (height / (7.0 / 5.0)), (float) (width / (35.0 / 4.0)), (float) (height / (70.0 / 13.0)));

    // Sun
    stroke(255, 230, 66);
    fill(255, 230, 66);
    ellipse(width, 0, (float) (width / 2.0), (float) (height / 2.0));

    line((float) (width / (7.0 / 5.0)), (float) (height / (35.0)), (float) (width / (7.0 / 4.0)), (float) (height / 14.0));
    line((float) (width / (70.0 / 53.0)), (float) (height / (35.0 / 4.0)), (float) (width / (14.0 / 9.0)), (float) (height / (35.0 / 6.0)));
    line((float) (width / (70.0 / 57.0)), (float) (height / (70.0 / 9.0)), (float) (width / (7.0 / 5.0)), (float) (height / (70.0 / 17.0)));
    line((float) (width / (70.0 / 61.0)), (float) (height / (140.0 / 19.0)), (float) (width / (14.0 / 11.0)), (float) (height / (35.0 / 11.0)));
    line((float) (width / (14.0 / 13.0)), (float) (height / 5.0), (float) (width / (10.0 / 9.0)), (float) (height / (140.0 / 47.0)));
    line((float) (width / (70.0 / 69.0)), (float) (height / (70.0 / 17.0)), (float) (width / (35.0 / 34.0)), (float) (height / (14.0 / 5.0)));

    // Clouds
    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse((float) (width / (35.0 / 9.0)), (float) (height / (140.0 / 11.0)), (float) (width / 7.0), (float) (height / (70.0 / 9.0)));
    ellipse((float) (width / (70.0 / 23.0)), (float) (height / (28.0 / 3.0)), (float) (width / 7.0), (float) (height / (70.0 / 9.0)));
    ellipse((float) (width / (35.5 / 8.0)), (float) (height / (140.0 / 13.0)), (float) (width / (35.5 / 6.0)), (float) (height / (70.0 / 9.0)));

    ellipse((float) (width / (7.0  / 5.0)), (float) (height / (140.0 / 19.0)), (float) (width / (35.0 / 6.0)), (float) (height / (28.0 / 3.0)));
    ellipse((float) (width / (70.0 / 53.0)), (float) (height / (28.0 / 3.0)), (float) (width / (140.0 / 27.0)), (float) (height / (70.0 / 9.0)));
    ellipse((float) (width / (70.0 / 47.0)), (float) (height / (140.0 / 13.0)), (float) (width / (35.0 / 6.0)), (float) (height / 7.0));
    

    // Moley
    stroke(0, 0, 0);
    fill(0, 0, 0);
    rect((float) (width / (100.0 / 21.0)), (float) (height / (10.0 / 7.0)), (float) (width / (350.0 / 3.0)), (float) (height / 35.0));

    stroke(49, 34, 160);
    fill(49, 34, 160);
    ellipse((float) (width / (14.0 / 3.0)), (float) (height / (70.0 / 53.0)), (float) (width / 10.0), (float) (height / (35.0 / 3.0)));

    stroke(255, 230, 66);
    fill(255, 230, 66);
    ellipse((float) (width / (14.0 / 3.0)), (float) (height / (140.0 / 107.0)), (float) (width / 35.0), (float) (height / 70.0));
    ellipse((float) (width / (14.0 / 3.0)), (float) (height / (175.0 / 122.0)), (float) (width / (175.0 / 2.0)), (float) (height / (175.0 / 2.0)));

    stroke(0, 0, 0);
    fill(0, 0, 0);
    ellipse((float) (width / (70.0 / 13.0)), (float) (height / (70.0 / 53.0)), (float) (width / (140.0 / 3.0)), (float) (height / 140.0));
    ellipse((float) (width / (70.0 / 17.0)), (float) (height / (70.0 / 53.0)), (float) (width / (140.0 / 3.0)), (float) (height / 140.0));
  }
}