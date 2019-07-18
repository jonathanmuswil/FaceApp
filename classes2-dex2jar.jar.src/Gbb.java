public class gbb
  extends RuntimeException
{
  private final int a;
  private final String b;
  private final transient tbb<?> c;
  
  public gbb(tbb<?> paramtbb)
  {
    super(a(paramtbb));
    this.a = paramtbb.b();
    this.b = paramtbb.e();
    this.c = paramtbb;
  }
  
  private static String a(tbb<?> paramtbb)
  {
    xbb.a(paramtbb, "response == null");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("HTTP ");
    localStringBuilder.append(paramtbb.b());
    localStringBuilder.append(" ");
    localStringBuilder.append(paramtbb.e());
    return localStringBuilder.toString();
  }
  
  public int a()
  {
    return this.a;
  }
  
  public tbb<?> b()
  {
    return this.c;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */