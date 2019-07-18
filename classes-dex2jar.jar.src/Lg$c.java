import com.bumptech.glide.load.a;

class Lg$c<Data>
  implements Ze<Data>
{
  private final byte[] a;
  private final Lg.b<Data> b;
  
  Lg$c(byte[] paramArrayOfByte, Lg.b<Data> paramb)
  {
    this.a = paramArrayOfByte;
    this.b = paramb;
  }
  
  public Class<Data> a()
  {
    return this.b.a();
  }
  
  public void a(Fe paramFe, Ze.a<? super Data> parama)
  {
    parama.a(this.b.a(this.a));
  }
  
  public void b() {}
  
  public a c()
  {
    return a.a;
  }
  
  public void cancel() {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Lg$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */