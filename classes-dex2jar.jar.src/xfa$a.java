public final class xfa$a
{
  public final <T> xfa<T> asProgress(float paramFloat)
  {
    return new xfa(paramFloat, null);
  }
  
  public final <T> xfa<T> asResult(T paramT)
  {
    oXa.b(paramT, "result");
    return new xfa(1.0F, paramT);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xfa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */