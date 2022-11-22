/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package samples.trading.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class TradeEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5638896660846976630L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TradeEvent\",\"namespace\":\"samples.trading.avro\",\"fields\":[{\"name\":\"ticker\",\"type\":\"string\"},{\"name\":\"event_time\",\"type\":\"string\"},{\"name\":\"price\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TradeEvent> ENCODER =
      new BinaryMessageEncoder<TradeEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TradeEvent> DECODER =
      new BinaryMessageDecoder<TradeEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TradeEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TradeEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TradeEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TradeEvent>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TradeEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TradeEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TradeEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TradeEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence ticker;
  private java.lang.CharSequence event_time;
  private double price;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TradeEvent() {}

  /**
   * All-args constructor.
   * @param ticker The new value for ticker
   * @param event_time The new value for event_time
   * @param price The new value for price
   */
  public TradeEvent(java.lang.CharSequence ticker, java.lang.CharSequence event_time, java.lang.Double price) {
    this.ticker = ticker;
    this.event_time = event_time;
    this.price = price;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ticker;
    case 1: return event_time;
    case 2: return price;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ticker = (java.lang.CharSequence)value$; break;
    case 1: event_time = (java.lang.CharSequence)value$; break;
    case 2: price = (java.lang.Double)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'ticker' field.
   * @return The value of the 'ticker' field.
   */
  public java.lang.CharSequence getTicker() {
    return ticker;
  }


  /**
   * Sets the value of the 'ticker' field.
   * @param value the value to set.
   */
  public void setTicker(java.lang.CharSequence value) {
    this.ticker = value;
  }

  /**
   * Gets the value of the 'event_time' field.
   * @return The value of the 'event_time' field.
   */
  public java.lang.CharSequence getEventTime() {
    return event_time;
  }


  /**
   * Sets the value of the 'event_time' field.
   * @param value the value to set.
   */
  public void setEventTime(java.lang.CharSequence value) {
    this.event_time = value;
  }

  /**
   * Gets the value of the 'price' field.
   * @return The value of the 'price' field.
   */
  public double getPrice() {
    return price;
  }


  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(double value) {
    this.price = value;
  }

  /**
   * Creates a new TradeEvent RecordBuilder.
   * @return A new TradeEvent RecordBuilder
   */
  public static samples.trading.avro.TradeEvent.Builder newBuilder() {
    return new samples.trading.avro.TradeEvent.Builder();
  }

  /**
   * Creates a new TradeEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TradeEvent RecordBuilder
   */
  public static samples.trading.avro.TradeEvent.Builder newBuilder(samples.trading.avro.TradeEvent.Builder other) {
    if (other == null) {
      return new samples.trading.avro.TradeEvent.Builder();
    } else {
      return new samples.trading.avro.TradeEvent.Builder(other);
    }
  }

  /**
   * Creates a new TradeEvent RecordBuilder by copying an existing TradeEvent instance.
   * @param other The existing instance to copy.
   * @return A new TradeEvent RecordBuilder
   */
  public static samples.trading.avro.TradeEvent.Builder newBuilder(samples.trading.avro.TradeEvent other) {
    if (other == null) {
      return new samples.trading.avro.TradeEvent.Builder();
    } else {
      return new samples.trading.avro.TradeEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for TradeEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TradeEvent>
    implements org.apache.avro.data.RecordBuilder<TradeEvent> {

    private java.lang.CharSequence ticker;
    private java.lang.CharSequence event_time;
    private double price;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(samples.trading.avro.TradeEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ticker)) {
        this.ticker = data().deepCopy(fields()[0].schema(), other.ticker);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.event_time)) {
        this.event_time = data().deepCopy(fields()[1].schema(), other.event_time);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.price)) {
        this.price = data().deepCopy(fields()[2].schema(), other.price);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing TradeEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(samples.trading.avro.TradeEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.ticker)) {
        this.ticker = data().deepCopy(fields()[0].schema(), other.ticker);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.event_time)) {
        this.event_time = data().deepCopy(fields()[1].schema(), other.event_time);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.price)) {
        this.price = data().deepCopy(fields()[2].schema(), other.price);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'ticker' field.
      * @return The value.
      */
    public java.lang.CharSequence getTicker() {
      return ticker;
    }


    /**
      * Sets the value of the 'ticker' field.
      * @param value The value of 'ticker'.
      * @return This builder.
      */
    public samples.trading.avro.TradeEvent.Builder setTicker(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ticker = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ticker' field has been set.
      * @return True if the 'ticker' field has been set, false otherwise.
      */
    public boolean hasTicker() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ticker' field.
      * @return This builder.
      */
    public samples.trading.avro.TradeEvent.Builder clearTicker() {
      ticker = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'event_time' field.
      * @return The value.
      */
    public java.lang.CharSequence getEventTime() {
      return event_time;
    }


    /**
      * Sets the value of the 'event_time' field.
      * @param value The value of 'event_time'.
      * @return This builder.
      */
    public samples.trading.avro.TradeEvent.Builder setEventTime(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.event_time = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'event_time' field has been set.
      * @return True if the 'event_time' field has been set, false otherwise.
      */
    public boolean hasEventTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'event_time' field.
      * @return This builder.
      */
    public samples.trading.avro.TradeEvent.Builder clearEventTime() {
      event_time = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'price' field.
      * @return The value.
      */
    public double getPrice() {
      return price;
    }


    /**
      * Sets the value of the 'price' field.
      * @param value The value of 'price'.
      * @return This builder.
      */
    public samples.trading.avro.TradeEvent.Builder setPrice(double value) {
      validate(fields()[2], value);
      this.price = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public samples.trading.avro.TradeEvent.Builder clearPrice() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TradeEvent build() {
      try {
        TradeEvent record = new TradeEvent();
        record.ticker = fieldSetFlags()[0] ? this.ticker : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.event_time = fieldSetFlags()[1] ? this.event_time : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.price = fieldSetFlags()[2] ? this.price : (java.lang.Double) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TradeEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<TradeEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TradeEvent>
    READER$ = (org.apache.avro.io.DatumReader<TradeEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.ticker);

    out.writeString(this.event_time);

    out.writeDouble(this.price);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.ticker = in.readString(this.ticker instanceof Utf8 ? (Utf8)this.ticker : null);

      this.event_time = in.readString(this.event_time instanceof Utf8 ? (Utf8)this.event_time : null);

      this.price = in.readDouble();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.ticker = in.readString(this.ticker instanceof Utf8 ? (Utf8)this.ticker : null);
          break;

        case 1:
          this.event_time = in.readString(this.event_time instanceof Utf8 ? (Utf8)this.event_time : null);
          break;

        case 2:
          this.price = in.readDouble();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










