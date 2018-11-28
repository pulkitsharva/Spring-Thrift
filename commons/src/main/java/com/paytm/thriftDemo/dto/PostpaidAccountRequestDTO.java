/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.paytm.thriftDemo.dto;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-28")
public class PostpaidAccountRequestDTO implements org.apache.thrift.TBase<PostpaidAccountRequestDTO, PostpaidAccountRequestDTO._Fields>, java.io.Serializable, Cloneable, Comparable<PostpaidAccountRequestDTO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PostpaidAccountRequestDTO");

  private static final org.apache.thrift.protocol.TField ACCOUNT_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("accountNumber", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CUSTOMER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("customerId", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PostpaidAccountRequestDTOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PostpaidAccountRequestDTOTupleSchemeFactory();

  public String accountNumber; // required
  public int customerId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACCOUNT_NUMBER((short)1, "accountNumber"),
    CUSTOMER_ID((short)2, "customerId");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ACCOUNT_NUMBER
          return ACCOUNT_NUMBER;
        case 2: // CUSTOMER_ID
          return CUSTOMER_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CUSTOMERID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CUSTOMER_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACCOUNT_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("accountNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CUSTOMER_ID, new org.apache.thrift.meta_data.FieldMetaData("customerId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PostpaidAccountRequestDTO.class, metaDataMap);
  }

  public PostpaidAccountRequestDTO() {
  }

  public PostpaidAccountRequestDTO(
    String accountNumber)
  {
    this();
    this.accountNumber = accountNumber;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PostpaidAccountRequestDTO(PostpaidAccountRequestDTO other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAccountNumber()) {
      this.accountNumber = other.accountNumber;
    }
    this.customerId = other.customerId;
  }

  public PostpaidAccountRequestDTO deepCopy() {
    return new PostpaidAccountRequestDTO(this);
  }

  @Override
  public void clear() {
    this.accountNumber = null;
    setCustomerIdIsSet(false);
    this.customerId = 0;
  }

  public String getAccountNumber() {
    return this.accountNumber;
  }

  public PostpaidAccountRequestDTO setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  public void unsetAccountNumber() {
    this.accountNumber = null;
  }

  /** Returns true if field accountNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetAccountNumber() {
    return this.accountNumber != null;
  }

  public void setAccountNumberIsSet(boolean value) {
    if (!value) {
      this.accountNumber = null;
    }
  }

  public int getCustomerId() {
    return this.customerId;
  }

  public PostpaidAccountRequestDTO setCustomerId(int customerId) {
    this.customerId = customerId;
    setCustomerIdIsSet(true);
    return this;
  }

  public void unsetCustomerId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CUSTOMERID_ISSET_ID);
  }

  /** Returns true if field customerId is set (has been assigned a value) and false otherwise */
  public boolean isSetCustomerId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CUSTOMERID_ISSET_ID);
  }

  public void setCustomerIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CUSTOMERID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACCOUNT_NUMBER:
      if (value == null) {
        unsetAccountNumber();
      } else {
        setAccountNumber((String)value);
      }
      break;

    case CUSTOMER_ID:
      if (value == null) {
        unsetCustomerId();
      } else {
        setCustomerId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACCOUNT_NUMBER:
      return getAccountNumber();

    case CUSTOMER_ID:
      return getCustomerId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACCOUNT_NUMBER:
      return isSetAccountNumber();
    case CUSTOMER_ID:
      return isSetCustomerId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PostpaidAccountRequestDTO)
      return this.equals((PostpaidAccountRequestDTO)that);
    return false;
  }

  public boolean equals(PostpaidAccountRequestDTO that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_accountNumber = true && this.isSetAccountNumber();
    boolean that_present_accountNumber = true && that.isSetAccountNumber();
    if (this_present_accountNumber || that_present_accountNumber) {
      if (!(this_present_accountNumber && that_present_accountNumber))
        return false;
      if (!this.accountNumber.equals(that.accountNumber))
        return false;
    }

    boolean this_present_customerId = true && this.isSetCustomerId();
    boolean that_present_customerId = true && that.isSetCustomerId();
    if (this_present_customerId || that_present_customerId) {
      if (!(this_present_customerId && that_present_customerId))
        return false;
      if (this.customerId != that.customerId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAccountNumber()) ? 131071 : 524287);
    if (isSetAccountNumber())
      hashCode = hashCode * 8191 + accountNumber.hashCode();

    hashCode = hashCode * 8191 + ((isSetCustomerId()) ? 131071 : 524287);
    if (isSetCustomerId())
      hashCode = hashCode * 8191 + customerId;

    return hashCode;
  }

  @Override
  public int compareTo(PostpaidAccountRequestDTO other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAccountNumber()).compareTo(other.isSetAccountNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccountNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.accountNumber, other.accountNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCustomerId()).compareTo(other.isSetCustomerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCustomerId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.customerId, other.customerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PostpaidAccountRequestDTO(");
    boolean first = true;

    sb.append("accountNumber:");
    if (this.accountNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.accountNumber);
    }
    first = false;
    if (isSetCustomerId()) {
      if (!first) sb.append(", ");
      sb.append("customerId:");
      sb.append(this.customerId);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PostpaidAccountRequestDTOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PostpaidAccountRequestDTOStandardScheme getScheme() {
      return new PostpaidAccountRequestDTOStandardScheme();
    }
  }

  private static class PostpaidAccountRequestDTOStandardScheme extends org.apache.thrift.scheme.StandardScheme<PostpaidAccountRequestDTO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PostpaidAccountRequestDTO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACCOUNT_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.accountNumber = iprot.readString();
              struct.setAccountNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CUSTOMER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.customerId = iprot.readI32();
              struct.setCustomerIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PostpaidAccountRequestDTO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.accountNumber != null) {
        oprot.writeFieldBegin(ACCOUNT_NUMBER_FIELD_DESC);
        oprot.writeString(struct.accountNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCustomerId()) {
        oprot.writeFieldBegin(CUSTOMER_ID_FIELD_DESC);
        oprot.writeI32(struct.customerId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PostpaidAccountRequestDTOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PostpaidAccountRequestDTOTupleScheme getScheme() {
      return new PostpaidAccountRequestDTOTupleScheme();
    }
  }

  private static class PostpaidAccountRequestDTOTupleScheme extends org.apache.thrift.scheme.TupleScheme<PostpaidAccountRequestDTO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PostpaidAccountRequestDTO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAccountNumber()) {
        optionals.set(0);
      }
      if (struct.isSetCustomerId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAccountNumber()) {
        oprot.writeString(struct.accountNumber);
      }
      if (struct.isSetCustomerId()) {
        oprot.writeI32(struct.customerId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PostpaidAccountRequestDTO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.accountNumber = iprot.readString();
        struct.setAccountNumberIsSet(true);
      }
      if (incoming.get(1)) {
        struct.customerId = iprot.readI32();
        struct.setCustomerIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

