public enum Vm$a
{
  private final int i;
  private final String j;
  
  private Vm$a(int paramInt, String paramString)
  {
    this.i = paramInt;
    this.j = paramString;
  }
  
  public int a()
  {
    return this.i;
  }
  
  public String b()
  {
    return this.j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.i);
    localStringBuilder.append(": ");
    localStringBuilder.append(this.j);
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Vm$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */