package exam.lambda_stream2;

/*
Given the code fragment:

// Login time:2015-01-12T21:58:18.817Z
Instant loginTime = Instant.now();
Thread.sleep(1000);

// Logout time:2015-01-12T21:58:19.880Z
Instant logoutTime = Instant.now();

loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES);
logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);

if(logoutTime.isAfter(loginTime))
    System.out.println("Logged out at: " + logoutTime);
else
    System.out.println("Can't logout");

What is the result?
A. Can't logout
B. Logged out at: 2015-01-12T21:58:19.880Z
C. Logged out at: 2015-01-12T21:58:19.00Z
D. A compilation error occurs at line n1.

Ans: A
*/
