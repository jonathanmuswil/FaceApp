class yW$c
  implements iW
{
  private yW$c(yW paramyW) {}
  
  public <Result, WrappedResult, Data> Result a(JW<Result, WrappedResult, Data> paramJW, iW.a parama)
  {
    try
    {
      paramJW = yW.a(this.a).a(this.a.a, this.a.b);
      return paramJW;
    }
    catch (Exception parama)
    {
      paramJW = new StringBuilder();
      paramJW.append("Error has occurred during Get operation. query = ");
      paramJW.append(this.a.b);
      throw new jW(paramJW.toString(), parama);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yW$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */