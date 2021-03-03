/**
 * PrepayPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package prepay_pkg;

public interface PrepayPortType extends java.rmi.Remote {

    /**
     * Reverse Payment
     */
    public prepay_pkg.ReversePaymentResponse reversePayment(prepay_pkg.ReversePaymentRequest request) throws java.rmi.RemoteException;

    /**
     * Prepay Recharge
     */
    public prepay_pkg.PrepayRechargeResponse prepayRecharge(prepay_pkg.PrepayRechargeRequest request) throws java.rmi.RemoteException;

    /**
     * Check Status
     */
    public prepay_pkg.CheckStatusResponse checkStatus(prepay_pkg.CheckStatusRequest req) throws java.rmi.RemoteException;

    /**
     * Validate Customer
     */
    public prepay_pkg.ValidateCustomerResponse validateCustomer(prepay_pkg.ValidateCustomerRequest request) throws java.rmi.RemoteException;
}
