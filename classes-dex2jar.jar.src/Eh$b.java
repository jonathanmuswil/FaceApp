class Eh$b
  extends Eh
{
  public Eh.g a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return Eh.g.a;
  }
  
  public float b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 = (int)Math.ceil(Math.max(paramInt2 / paramInt4, paramInt1 / paramInt3));
    paramInt2 = Integer.highestOneBit(paramInt3);
    paramInt1 = 1;
    paramInt2 = Math.max(1, paramInt2);
    if (paramInt2 >= paramInt3) {
      paramInt1 = 0;
    }
    return 1.0F / (paramInt2 << paramInt1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Eh$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */