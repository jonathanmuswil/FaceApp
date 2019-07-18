public abstract class xza<VIEW extends sla>
  extends gla<VIEW>
{
  private final kya i;
  
  public xza(kya paramkya)
  {
    this.i = paramkya;
  }
  
  public void a(kya paramkya)
  {
    oXa.b(paramkya, "listener");
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      b(this.i);
      this.i.onCancel();
    }
    else
    {
      a(this.i);
      this.i.a();
    }
  }
  
  public void b(kya paramkya)
  {
    oXa.b(paramkya, "listener");
  }
  
  public final kya f()
  {
    return this.i;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */