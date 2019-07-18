public final class ig
  implements ag<int[]>
{
  public int a()
  {
    return 4;
  }
  
  public int a(int[] paramArrayOfInt)
  {
    return paramArrayOfInt.length;
  }
  
  public String getTag()
  {
    return "IntegerArrayPool";
  }
  
  public int[] newArray(int paramInt)
  {
    return new int[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */