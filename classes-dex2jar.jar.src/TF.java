final class tf
  extends RuntimeException
{
  tf(Throwable paramThrowable)
  {
    super("Unexpected exception thrown by non-Glide code", paramThrowable);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */