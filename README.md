# ATMFacility

https://chatgpt.com/share/d753b918-0d72-4cf8-b75c-879ef1a2fd5f

Sprinboot Microservices.

- Auth Service: Handles authentication and authorization.
- ATM Service: Manages ATM operations (e.g., cash withdrawal, deposit, balance inquiry).
- Account Service: Manages user account operations.
- Transaction Service: Logs and manages transaction history.
- Notification Service: Handles notifications (e.g., SMS, email alerts).
 
-----------------------------------------------------------------------------
## Potential Features for DebitCard Management.

1. User Registration and Authentication
- POST /api/v1/register
  Registers a new user. Collects basic user details like name, email, phone number, etc.
- POST /api/v1/login
  Authenticates a user and generates a JWT token for future requests.
- POST /api/v1/logout
  Logs out the user and invalidates the JWT token.
2. KYC (Know Your Customer) Verification
- POST /api/v1/kyc/submit
  Submits KYC documents like ID proof, address proof, etc. for verification.
- GET /api/v1/kyc/status
  Retrieves the current status of the KYC verification process.
- POST /api/v1/kyc/resubmit
  Resubmits KYC documents if the initial submission was rejected.
3. Debit Card Application
- POST /api/v1/debit-card/apply
  Applies for a new debit card. This would include selecting the type of card, linking it to a bank account, etc.
- GET /api/v1/debit-card/application-status
  Checks the status of the debit card application.
- POST /api/v1/debit-card/cancel-application
  Cancels a pending debit card application.
4. Debit Card Management
- GET /api/v1/debit-card/details
  Retrieves details of the active debit card(s) linked to the user's account.
- POST /api/v1/debit-card/activate
  Activates a newly received debit card.
- POST /api/v1/debit-card/block
  Blocks the debit card in case of theft or loss.
- POST /api/v1/debit-card/unblock
  Unblocks a debit card that was previously blocked.
- POST /api/v1/debit-card/reissue
  Requests a reissue of the debit card due to damage or loss.
5. PIN Management
- POST /api/v1/debit-card/set-pin
  Sets a new PIN for the debit card.
- POST /api/v1/debit-card/change-pin
  Changes the existing PIN of the debit card.
- POST /api/v1/debit-card/reset-pin
  Resets the PIN if the user has forgotten it.
6. Transaction History and Alerts
- GET /api/v1/debit-card/transactions
  Retrieves the transaction history of the debit card.
- POST /api/v1/debit-card/alerts/subscribe
  Subscribes to transaction alerts via SMS/email.
- POST /api/v1/debit-card/alerts/unsubscribe
  Unsubscribes from transaction alerts.
7. Support and Feedback
- POST /api/v1/support/ticket
  Creates a support ticket for issues related to the debit card.
- GET /api/v1/support/ticket-status
  Checks the status of a support ticket.
- POST /api/v1/feedback
  Submits feedback regarding the debit card service.
8. Account Management
- GET /api/v1/user/profile
  Retrieves the user profile details.
- POST /api/v1/user/update-profile
  Updates user profile information like address, phone number, etc.
9. Security and Compliance
- POST /api/v1/user/2fa/setup
  Sets up two-factor authentication for an added layer of security.
- POST /api/v1/user/2fa/verify
  Verifies the two-factor authentication during login or sensitive actions.
- POST /api/v1/user/security-questions
  Sets up security questions for account recovery.
10. Notifications
- GET /api/v1/notifications
  Retrieves notifications related to the debit card application, KYC status, etc.
- POST /api/v1/notifications/mark-read
  Marks notifications as read.
11. Audit Logs
- GET /api/v1/audit-logs
  Retrieves audit logs for user actions, such as card activation, blocking, etc.
