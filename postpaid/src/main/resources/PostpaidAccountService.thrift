namespace java thriftDemo.postpaid.accountService  // define namespace for java code

typedef i64 long
typedef i32 int

struct PostpaidAccountRequestDTO  {
  1: string accountNumber,
  2: optional int customerId
}

struct PostpaidAccountBO {
  1: string accountNumber,
  2: string firstName,
  3: int customerId,
  4: optional double dueAmount
}
exception AccountDoesNotExistException {
  1: int code,
  2: string errorMessage
}


service PostpaidAccountThriftService {
  PostpaidAccountBO getAccount(1: PostpaidAccountRequestDTO account) throws (1: AccountDoesNotExistException e)
}
