final class woa
  extends pXa
  implements dXa<Integer, Integer, Integer>
{
  public static final woa b = new woa();
  
  woa()
  {
    super(2);
  }
  
  public final int a(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0) {
      paramInt2--;
    } else if (paramInt1 >= paramInt2 * 10 - 1) {
      if (paramInt1 < paramInt2 * 20 - 1) {
        paramInt2 *= 2;
      } else if (paramInt1 < paramInt2 * 40 - 1) {
        paramInt2 *= 4;
      } else if (paramInt1 < paramInt2 * 80 - 1) {
        paramInt2 *= 8;
      } else {
        paramInt2 *= 16;
      }
    }
    return paramInt2;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/woa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */