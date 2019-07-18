class em
  implements vm
{
  private final int a;
  
  public em(int paramInt)
  {
    this.a = paramInt;
  }
  
  public StackTraceElement[] a(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    int i = paramArrayOfStackTraceElement.length;
    int j = this.a;
    if (i <= j) {
      return paramArrayOfStackTraceElement;
    }
    i = j / 2;
    int k = j - i;
    StackTraceElement[] arrayOfStackTraceElement = new StackTraceElement[j];
    System.arraycopy(paramArrayOfStackTraceElement, 0, arrayOfStackTraceElement, 0, k);
    System.arraycopy(paramArrayOfStackTraceElement, paramArrayOfStackTraceElement.length - i, arrayOfStackTraceElement, k, i);
    return arrayOfStackTraceElement;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/em.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */