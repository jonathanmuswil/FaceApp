class ej$a
{
  void a(Object paramObject)
  {
    paramObject.notifyAll();
  }
  
  void a(Object paramObject, long paramLong)
    throws InterruptedException
  {
    paramObject.wait(paramLong);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ej$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */