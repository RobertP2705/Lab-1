class Diffusion{
   public static void main(String []args) {
      int trials = 5;
      int[] steps = {20,30,40,50,60,70};
      for(int i = 0; i < steps.length; i++){
         for(int j = 1; j<=trials;j++){
            Particle a = new Particle();
            a.moveSteps(steps[i]);
            System.out.println("Steps:" + steps[i] + " | Trial:" + j + " | Position: " + a.getPosition());
         }
      }
   }
}