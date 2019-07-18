import java.util.Queue;

public class bh<A, B>
{
  private final Kj<bh.a<A>, B> a;
  
  public bh(long paramLong)
  {
    this.a = new ah(this, paramLong);
  }
  
  public B a(A paramA, int paramInt1, int paramInt2)
  {
    bh.a locala = bh.a.a(paramA, paramInt1, paramInt2);
    paramA = this.a.a(locala);
    locala.a();
    return paramA;
  }
  
  public void a(A paramA, int paramInt1, int paramInt2, B paramB)
  {
    paramA = bh.a.a(paramA, paramInt1, paramInt2);
    this.a.b(paramA, paramB);
  }
  
  static final class a<A>
  {
    private static final Queue<a<?>> a = Pj.a(0);
    private int b;
    private int c;
    private A d;
    
    static <A> a<A> a(A paramA, int paramInt1, int paramInt2)
    {
      synchronized (a)
      {
        a locala = (a)a.poll();
        ??? = locala;
        if (locala == null) {
          ??? = new a();
        }
        ((a)???).b(paramA, paramInt1, paramInt2);
        return (a<A>)???;
      }
    }
    
    private void b(A paramA, int paramInt1, int paramInt2)
    {
      this.d = paramA;
      this.c = paramInt1;
      this.b = paramInt2;
    }
    
    public void a()
    {
      synchronized (a)
      {
        a.offer(this);
        return;
      }
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof a;
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        paramObject = (a)paramObject;
        bool3 = bool2;
        if (this.c == ((a)paramObject).c)
        {
          bool3 = bool2;
          if (this.b == ((a)paramObject).b)
          {
            bool3 = bool2;
            if (this.d.equals(((a)paramObject).d)) {
              bool3 = true;
            }
          }
        }
      }
      return bool3;
    }
    
    public int hashCode()
    {
      return (this.b * 31 + this.c) * 31 + this.d.hashCode();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */