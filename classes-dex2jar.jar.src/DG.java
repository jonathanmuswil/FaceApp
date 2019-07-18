import java.util.Queue;

abstract class dg<T extends mg>
{
  private final Queue<T> a = Pj.a(20);
  
  abstract T a();
  
  public void a(T paramT)
  {
    if (this.a.size() < 20) {
      this.a.offer(paramT);
    }
  }
  
  T b()
  {
    mg localmg1 = (mg)this.a.poll();
    mg localmg2 = localmg1;
    if (localmg1 == null) {
      localmg2 = a();
    }
    return localmg2;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */