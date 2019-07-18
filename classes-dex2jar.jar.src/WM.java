class wm
{
  public final String a;
  public final String b;
  public final StackTraceElement[] c;
  public final wm d;
  
  public wm(Throwable paramThrowable, vm paramvm)
  {
    this.a = paramThrowable.getLocalizedMessage();
    this.b = paramThrowable.getClass().getName();
    this.c = paramvm.a(paramThrowable.getStackTrace());
    paramThrowable = paramThrowable.getCause();
    if (paramThrowable != null) {
      paramThrowable = new wm(paramThrowable, paramvm);
    } else {
      paramThrowable = null;
    }
    this.d = paramThrowable;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */