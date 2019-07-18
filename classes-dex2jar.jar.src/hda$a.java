public abstract class hda$a
{
  private final String a;
  
  private hda$a(String paramString)
  {
    this.a = paramString;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public static abstract class a
    extends hda.a
  {
    private final String b;
    
    private a(String paramString)
    {
      super(null);
      this.b = paramString;
    }
    
    public static final class a
      extends hda.a.a
    {
      public static final a c = new a();
      
      private a()
      {
        super(null);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hda$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */