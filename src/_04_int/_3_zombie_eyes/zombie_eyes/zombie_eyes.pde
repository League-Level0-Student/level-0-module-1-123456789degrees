
void setup() {
  PImage face = loadImage("face.jpeg");
  size(1000,1000);
  face.resize(1000,1000);
  image(face, 0, 0);
}
void draw() {
  fill(255,0,0);
  if (mouseX > 500 && mouseY > 500) {
    fill(100,100,50);
  }
  else if (mouseX > 500 && mouseY < 500) {
    fill(200,0,150);
  }
  else if (mouseX < 500 && mouseY > 500)
 {
   fill(255,0,0);
 }
 else {
   fill (223,125,255);
 }
 ellipse(345,170,140,140);
 ellipse(500,130,100,100);
 fill(0,0,0);
 ellipse(345,170,10,10);
 ellipse(500,130,10,10);
}
