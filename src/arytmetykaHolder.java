
/**
* arytmetykaHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Arytmetyka.idl
* Saturday, 6 June 2020 12:20:46 o'clock BST
*/

public final class arytmetykaHolder implements org.omg.CORBA.portable.Streamable
{
  public arytmetyka value = null;

  public arytmetykaHolder ()
  {
  }

  public arytmetykaHolder (arytmetyka initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = arytmetykaHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    arytmetykaHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return arytmetykaHelper.type ();
  }

}
