@Deprecated
public abstract class qj<Z>
  extends lj<Z>
{
  private final int b;
  private final int c;
  
  public qj()
  {
    this(Integer.MIN_VALUE, Integer.MIN_VALUE);
  }
  
  public qj(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public void a(rj paramrj) {}
  
  public final void b(rj paramrj)
  {
    if (Pj.b(this.b, this.c))
    {
      paramrj.a(this.b, this.c);
      return;
    }
    paramrj = new StringBuilder();
    paramrj.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
    paramrj.append(this.b);
    paramrj.append(" and height: ");
    paramrj.append(this.c);
    paramrj.append(", either provide dimensions in the constructor or call override()");
    throw new IllegalArgumentException(paramrj.toString());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */