public enum yra$a$a
{
  private final String d;
  private final boolean e;
  
  static
  {
    a locala1 = new a("ONLY_SAVE_IMAGE", 0, "only_save_image", true);
    a = locala1;
    a locala2 = new a("ALL_DISABLED", 1, "all_disabled", false);
    b = locala2;
    c = new a[] { locala1, locala2 };
  }
  
  private yra$a$a(String paramString, boolean paramBoolean)
  {
    this.d = paramString;
    this.e = paramBoolean;
  }
  
  public final String a()
  {
    return this.d;
  }
  
  public final boolean b()
  {
    return this.e;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yra$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */