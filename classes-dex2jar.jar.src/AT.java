final class at
  implements ht
{
  private ht[] a;
  
  at(ht... paramVarArgs)
  {
    this.a = paramVarArgs;
  }
  
  public final gt a(Class<?> paramClass)
  {
    for (ht localht : this.a) {
      if (localht.b(paramClass)) {
        return localht.a(paramClass);
      }
    }
    paramClass = String.valueOf(paramClass.getName());
    if (paramClass.length() != 0) {
      paramClass = "No factory is available for message type: ".concat(paramClass);
    } else {
      paramClass = new String("No factory is available for message type: ");
    }
    throw new UnsupportedOperationException(paramClass);
  }
  
  public final boolean b(Class<?> paramClass)
  {
    ht[] arrayOfht = this.a;
    int i = arrayOfht.length;
    for (int j = 0; j < i; j++) {
      if (arrayOfht[j].b(paramClass)) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */