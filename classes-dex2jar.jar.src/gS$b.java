import java.io.IOException;

abstract class gS$b
{
  final String a;
  final boolean b;
  final boolean c;
  
  protected gS$b(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramString;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
  }
  
  abstract void a(cT paramcT, Object paramObject)
    throws IOException, IllegalAccessException;
  
  abstract void a(eT parameT, Object paramObject)
    throws IOException, IllegalAccessException;
  
  abstract boolean a(Object paramObject)
    throws IOException, IllegalAccessException;
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gS$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */