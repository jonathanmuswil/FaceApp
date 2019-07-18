public abstract class kI$c<MessageType extends c<MessageType, BuilderType>, BuilderType>
  extends kI<MessageType, BuilderType>
  implements VI
{
  protected bI<Object> zzagt = bI.g();
  
  final bI<Object> m()
  {
    if (this.zzagt.c()) {
      this.zzagt = ((bI)this.zzagt.clone());
    }
    return this.zzagt;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kI$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */