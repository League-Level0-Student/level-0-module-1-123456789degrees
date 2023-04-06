int x = 400; 
int y = 600; 

void setup() {
    size(800, 800);
    
}

void draw() {
    background(0, 0, 40); 
      fill(random(255), 0, 0);
      ellipse(x, 130, 90, 90);
      fill(248, 128, 0);
      ellipse(x, 145, 70, 70);
      fill(255, 153, 0);
      ellipse(x, 125, 35, 35);
      fill(100, 100, 100);
      triangle(x, 30, x + 50, 120, x - 50, 120);
    

}
