import java.util.Map;

class Fk$a
{
  final Fk.b a;
  final long b;
  Map<String, String> c;
  String d;
  Map<String, Object> e;
  String f;
  Map<String, Object> g;
  
  public Fk$a(Fk.b paramb)
  {
    this.a = paramb;
    this.b = System.currentTimeMillis();
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = null;
  }
  
  public a a(Map<String, Object> paramMap)
  {
    this.e = paramMap;
    return this;
  }
  
  public Fk a(Gk paramGk)
  {
    return new Fk(paramGk, this.b, this.a, this.c, this.d, this.e, this.f, this.g, null);
  }
  
  public a b(Map<String, String> paramMap)
  {
    this.c = paramMap;
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Fk$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */