import android.graphics.Path;

abstract class Ua$e
  extends Ua.d
{
  protected tc.b[] a = null;
  String b;
  int c;
  
  public Ua$e()
  {
    super(null);
  }
  
  public Ua$e(e parame)
  {
    super(null);
    this.b = parame.b;
    this.c = parame.c;
    this.a = tc.a(parame.a);
  }
  
  public void a(Path paramPath)
  {
    paramPath.reset();
    tc.b[] arrayOfb = this.a;
    if (arrayOfb != null) {
      tc.b.a(arrayOfb, paramPath);
    }
  }
  
  public boolean b()
  {
    return false;
  }
  
  public tc.b[] getPathData()
  {
    return this.a;
  }
  
  public String getPathName()
  {
    return this.b;
  }
  
  public void setPathData(tc.b[] paramArrayOfb)
  {
    if (!tc.a(this.a, paramArrayOfb)) {
      this.a = tc.a(paramArrayOfb);
    } else {
      tc.b(this.a, paramArrayOfb);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Ua$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */