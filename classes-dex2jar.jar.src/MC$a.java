import java.util.List;

final class mc$a
{
  final int[] a;
  final float[] b;
  
  mc$a(int paramInt1, int paramInt2)
  {
    this.a = new int[] { paramInt1, paramInt2 };
    this.b = new float[] { 0.0F, 1.0F };
  }
  
  mc$a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = new int[] { paramInt1, paramInt2, paramInt3 };
    this.b = new float[] { 0.0F, 0.5F, 1.0F };
  }
  
  mc$a(List<Integer> paramList, List<Float> paramList1)
  {
    int i = paramList.size();
    this.a = new int[i];
    this.b = new float[i];
    for (int j = 0; j < i; j++)
    {
      this.a[j] = ((Integer)paramList.get(j)).intValue();
      this.b[j] = ((Float)paramList1.get(j)).floatValue();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mc$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */