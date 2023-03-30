PImage pepperoni;
PImage mushroom;
PImage olive;

void setup() {
    size(1000, 1000);
    fill(#B46C4B);
    ellipse(500,500,1000,1000);
    pepperoni = loadImage("pepperoni.png");
    olive = loadImage("olive.png");
    mushroom = loadImage("mushroom.png");
}
void draw() {
  if (mousePressed) {
    image(pepperoni, 200,200);
    pepperoni.resize(30,30);
    image(olive, 256,235);
    olive.resize(30,30);
    image(mushroom, 341,100);
    mushroom.resize(30,30);
    image(pepperoni, 126,376);
    pepperoni.resize(30,30);
    image(olive, 12,379);
    olive.resize(30,30);
    image(mushroom, 123,246);
    mushroom.resize(30,30);


  }
}
