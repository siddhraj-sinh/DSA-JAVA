class TowerOfHanoi{
  public static void Hanoi(int n, char src, char aux, char dest){
    if(n==0) return;
    Hanoi(n-1,src,dest,aux);
    System.out.println("transfer disk "+n+"from "+src+"to "+dest);
    Hanoi(n-1,aux,src,dest);
  }
  public static void main(String[] args) {
    int n=3;
    Hanoi(n,'A','B','C');
  }
}
