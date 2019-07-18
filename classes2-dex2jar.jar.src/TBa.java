public class tBa<PAYLOAD>
{
  private String a = "";
  private PAYLOAD b;
  private final sBa c = new sBa();
  private final rBa d = new rBa(this);
  
  public final aBa<PAYLOAD> a(boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean) {
      localObject = this.d;
    } else {
      localObject = this.c;
    }
    return (aBa<PAYLOAD>)localObject;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(PAYLOAD paramPAYLOAD)
  {
    this.b = paramPAYLOAD;
  }
  
  public void a(String paramString)
  {
    oXa.b(paramString, "<set-?>");
    this.a = paramString;
  }
  
  public PAYLOAD b()
  {
    return (PAYLOAD)this.b;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tBa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */