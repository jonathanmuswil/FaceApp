class dm
  implements vm
{
  private final int a;
  private final vm[] b;
  private final em c;
  
  public dm(int paramInt, vm... paramVarArgs)
  {
    this.a = paramInt;
    this.b = paramVarArgs;
    this.c = new em(paramInt);
  }
  
  public StackTraceElement[] a(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    if (paramArrayOfStackTraceElement.length <= this.a) {
      return paramArrayOfStackTraceElement;
    }
    vm[] arrayOfvm = this.b;
    int i = arrayOfvm.length;
    int j = 0;
    StackTraceElement[] arrayOfStackTraceElement = paramArrayOfStackTraceElement;
    while (j < i)
    {
      vm localvm = arrayOfvm[j];
      if (arrayOfStackTraceElement.length <= this.a) {
        break;
      }
      arrayOfStackTraceElement = localvm.a(paramArrayOfStackTraceElement);
      j++;
    }
    paramArrayOfStackTraceElement = arrayOfStackTraceElement;
    if (arrayOfStackTraceElement.length > this.a) {
      paramArrayOfStackTraceElement = this.c.a(arrayOfStackTraceElement);
    }
    return paramArrayOfStackTraceElement;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */