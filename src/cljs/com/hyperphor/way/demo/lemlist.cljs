(ns com.hyperphor.way.demo.lemlist
  (:require [com.hyperphor.way.vega :as v]
            ))

;; Full
(def data
  '({:type "emailsSent", :user "usr_qNqwD8aE4CbyzWr3s", :count 144}
    {:type "emailsClicked", :user "usr_BN98uhoTqHdwTiwhT", :count 10}
    {:type "linkedinInviteDone", :user "usr_4Tq2hiZYvoPaaET46", :count 82}
    {:type "emailsReplied", :user "usr_BN98uhoTqHdwTiwhT", :count 1}
    {:type "emailsReplied", :user "usr_ZAFzAMbnbzuerskn6", :count 31}
    {:type "linkedinOpened", :user "usr_kCeLwjg9xcfcYa4nG", :count 8}
    {:type "emailsClicked", :user "usr_GCAf2NfN53yfuJWQm", :count 202}
    {:type "emailsBounced", :user "usr_uqgZEE4JteQEQ9YAZ", :count 29}
    {:type "linkedinVisitFailed", :user "usr_7oLRwJnEHXbsbyZbC", :count 6}
    {:type "emailsReplied", :user "usr_2MSdRxiwuytogvr4Y", :count 3}
    {:type "emailsUnsubscribed", :user "usr_ZAFzAMbnbzuerskn6", :count 30}
    {:type "linkedinOpened", :user "usr_uqgZEE4JteQEQ9YAZ", :count 10}
    {:type "linkedinSendFailed", :user "usr_4Tq2hiZYvoPaaET46", :count 67}
    {:type "emailsSent", :user "usr_fqzFxTz5DngDahXPE", :count 146}
    {:type "linkedinReplied", :user "usr_4Tq2hiZYvoPaaET46", :count 3}
    {:type "linkedinVisitDone", :user "usr_Jnns6MEdD5GcRubuQ", :count 14}
    {:type "emailsReplied", :user "usr_kCeLwjg9xcfcYa4nG", :count 2}
    {:type "emailsReplied", :user "usr_ywbPXNoajoC7jByYb", :count 26}
    {:type "conditionChosen", :user "usr_kN56zRMEuGHrccuxy", :count 72}
    {:type "linkedinInviteFailed", :user "usr_7oLRwJnEHXbsbyZbC", :count 1}
    {:type "linkedinInviteDone", :user "usr_Jnns6MEdD5GcRubuQ", :count 14}
    {:type "emailsOpened", :user "usr_HHNHASpgiYBnRJupS", :count 3}
    {:type "emailsOpened", :user "usr_GCAf2NfN53yfuJWQm", :count 1037}
    {:type "emailsUnsubscribed", :user "usr_7oLRwJnEHXbsbyZbC", :count 8}
    {:type "linkedinSent", :user "usr_fqzFxTz5DngDahXPE", :count 9}
    {:type "emailsBounced", :user "usr_BN98uhoTqHdwTiwhT", :count 6}
    {:type "linkedinOpened", :user "usr_GCAf2NfN53yfuJWQm", :count 4}
    {:type "linkedinVisitDone", :user "usr_ywbPXNoajoC7jByYb", :count 67}
    {:type "skipped", :user "usr_4Tq2hiZYvoPaaET46", :count 151}
    {:type "skipped", :user "usr_ZAFzAMbnbzuerskn6", :count 62}
    {:type "emailsOpened", :user "usr_uqgZEE4JteQEQ9YAZ", :count 644}
    {:type "linkedinInviteAccepted", :user "usr_qNqwD8aE4CbyzWr3s", :count 8}
    {:type "linkedinVisitFailed", :user "usr_uqgZEE4JteQEQ9YAZ", :count 3}
    {:type "emailsOpened", :user "usr_kN56zRMEuGHrccuxy", :count 250}
    {:type "conditionChosen", :user "usr_kCeLwjg9xcfcYa4nG", :count 74}
    {:type "conditionChosen", :user "usr_7oLRwJnEHXbsbyZbC", :count 129}
    {:type "emailsReplied", :user "usr_x9svQmwswqjctdMcp", :count 4}
    {:type "linkedinInviteAccepted", :user "usr_GCAf2NfN53yfuJWQm", :count 117}
    {:type "skipped", :user "usr_qNqwD8aE4CbyzWr3s", :count 39}
    {:type "conditionChosen", :user "usr_ywbPXNoajoC7jByYb", :count 17}
    {:type "manualDone", :user "usr_iZfJGa23wiwiCqjjH", :count 20}
    {:type "linkedinInviteDone", :user "usr_kCeLwjg9xcfcYa4nG", :count 61}
    {:type "linkedinOpened", :user "usr_kN56zRMEuGHrccuxy", :count 6}
    {:type "linkedinReplied", :user "usr_kN56zRMEuGHrccuxy", :count 1}
    {:type "linkedinVisitDone", :user "usr_4Tq2hiZYvoPaaET46", :count 237}
    {:type "linkedinVisitDone", :user "usr_kN56zRMEuGHrccuxy", :count 126}
    {:type "emailsOpened", :user "usr_BN98uhoTqHdwTiwhT", :count 136}
    {:type "linkedinOpened", :user "usr_ZAFzAMbnbzuerskn6", :count 3}
    {:type "paused", :user "usr_kCeLwjg9xcfcYa4nG", :count 1}
    {:type "skipped", :user "usr_kCeLwjg9xcfcYa4nG", :count 95}
    {:type "linkedinSent", :user "usr_7oLRwJnEHXbsbyZbC", :count 104}
    {:type "resumed", :user "usr_7oLRwJnEHXbsbyZbC", :count 100}
    {:type "emailsSent", :user "usr_2MSdRxiwuytogvr4Y", :count 10}
    {:type "emailsSent", :user "usr_iZfJGa23wiwiCqjjH", :count 39}
    {:type "emailsOpened", :user "usr_vKK8EhG47mdn2YGwp", :count 3}
    {:type "emailsOpened", :user "usr_373Av9HDcgCSj8b8d", :count 5}
    {:type "emailsSent", :user "usr_uqgZEE4JteQEQ9YAZ", :count 1331}
    {:type "emailsReplied", :user "usr_LeiW8oBTCpZZgjs72", :count 8}
    {:type "linkedinNotInterested", :user "usr_iZfJGa23wiwiCqjjH", :count 3}
    {:type "emailsBounced", :user "usr_LeiW8oBTCpZZgjs72", :count 23}
    {:type "linkedinVisitDone", :user "usr_2MSdRxiwuytogvr4Y", :count 3}
    {:type "manualDone", :user "usr_GCAf2NfN53yfuJWQm", :count 232}
    {:type "linkedinVisitFailed", :user "usr_kCeLwjg9xcfcYa4nG", :count 13}
    {:type "emailsOpened", :user "usr_kCeLwjg9xcfcYa4nG", :count 182}
    {:type "linkedinInviteAccepted", :user "usr_ywbPXNoajoC7jByYb", :count 12}
    {:type "linkedinInviteAccepted", :user "usr_4Tq2hiZYvoPaaET46", :count 11}
    {:type "emailsOpened", :user "usr_ZAFzAMbnbzuerskn6", :count 1231}
    {:type "linkedinSent", :user "usr_GCAf2NfN53yfuJWQm", :count 3}
    {:type "emailsDone", :user "usr_ywbPXNoajoC7jByYb", :count 7}
    {:type "linkedinReplied", :user "usr_qNqwD8aE4CbyzWr3s", :count 17}
    {:type "paused", :user "usr_uqgZEE4JteQEQ9YAZ", :count 1}
    {:type "emailsClicked", :user "usr_kN56zRMEuGHrccuxy", :count 74}
    {:type "conditionChosen", :user "usr_GCAf2NfN53yfuJWQm", :count 37}
    {:type "paused", :user "usr_ZAFzAMbnbzuerskn6", :count 1025}
    {:type "linkedinVisitFailed", :user "usr_kN56zRMEuGHrccuxy", :count 10}
    {:type "linkedinInviteAccepted", :user "usr_ZAFzAMbnbzuerskn6", :count 3}
    {:type "paused", :user nil, :count 1522}
    {:type "linkedinInterested", :user "usr_qNqwD8aE4CbyzWr3s", :count 1}
    {:type "emailsSent", :user "usr_ZAFzAMbnbzuerskn6", :count 2101}
    {:type "emailsOpened", :user "usr_4Tq2hiZYvoPaaET46", :count 147}
    {:type "manualUnsubscribed", :user "usr_iZfJGa23wiwiCqjjH", :count 1}
    {:type "emailsUnsubscribed", :user "usr_fqzFxTz5DngDahXPE", :count 6}
    {:type "linkedinSendFailed", :user "usr_7oLRwJnEHXbsbyZbC", :count 121}
    {:type "linkedinInviteDone", :user "usr_ZAFzAMbnbzuerskn6", :count 19}
    {:type "linkedinVisitDone", :user "usr_7oLRwJnEHXbsbyZbC", :count 587}
    {:type "emailsSent", :user "usr_kCeLwjg9xcfcYa4nG", :count 460}
    {:type "linkedinInviteAccepted", :user "usr_fqzFxTz5DngDahXPE", :count 4}
    {:type "manualUnsubscribed", :user "usr_GCAf2NfN53yfuJWQm", :count 17}
    {:type "linkedinInviteDone", :user "usr_uqgZEE4JteQEQ9YAZ", :count 320}
    {:type "linkedinSendFailed", :user "usr_qNqwD8aE4CbyzWr3s", :count 5}
    {:type "linkedinVisitDone", :user "usr_GCAf2NfN53yfuJWQm", :count 390}
    {:type "linkedinSendFailed", :user "usr_ywbPXNoajoC7jByYb", :count 18}
    {:type "linkedinVisitDone", :user "usr_qNqwD8aE4CbyzWr3s", :count 14}
    {:type "emailsUnsubscribed", :user "usr_BN98uhoTqHdwTiwhT", :count 6}
    {:type "emailsUnsubscribed", :user "usr_uqgZEE4JteQEQ9YAZ", :count 3}
    {:type "emailsDone", :user "usr_qNqwD8aE4CbyzWr3s", :count 3}
    {:type "linkedinSent", :user "usr_qNqwD8aE4CbyzWr3s", :count 3}
    {:type "linkedinVisitDone", :user "usr_fqzFxTz5DngDahXPE", :count 69}
    {:type "emailsSent", :user "usr_ywbPXNoajoC7jByYb", :count 137}
    {:type "conditionChosen", :user "usr_ZAFzAMbnbzuerskn6", :count 37}
    {:type "emailsUnsubscribed", :user "usr_kN56zRMEuGHrccuxy", :count 76}
    {:type "emailsNotInterested", :user "usr_vKK8EhG47mdn2YGwp", :count 1}
    {:type "linkedinOpened", :user "usr_7oLRwJnEHXbsbyZbC", :count 15}
    {:type "emailsSent", :user "usr_HHNHASpgiYBnRJupS", :count 2}
    {:type "emailsReplied", :user "usr_fqzFxTz5DngDahXPE", :count 1}
    {:type "linkedinSent", :user "usr_4Tq2hiZYvoPaaET46", :count 15}
    {:type "skipped", :user "usr_ywbPXNoajoC7jByYb", :count 34}
    {:type "emailsInterested", :user "usr_qNqwD8aE4CbyzWr3s", :count 6}
    {:type "linkedinOpened", :user "usr_4Tq2hiZYvoPaaET46", :count 7}
    {:type "emailsBounced", :user "usr_4Tq2hiZYvoPaaET46", :count 1}
    {:type "emailsDone", :user "usr_GCAf2NfN53yfuJWQm", :count 23}
    {:type "linkedinSendFailed", :user "usr_kCeLwjg9xcfcYa4nG", :count 1}
    {:type "emailsOpened", :user "usr_x9svQmwswqjctdMcp", :count 45}
    {:type "linkedinInviteAccepted", :user "usr_uqgZEE4JteQEQ9YAZ", :count 68}
    {:type "linkedinOpened", :user "usr_fqzFxTz5DngDahXPE", :count 2}
    {:type "manualDone", :user "usr_ywbPXNoajoC7jByYb", :count 30}
    {:type "linkedinVisitFailed", :user "usr_GCAf2NfN53yfuJWQm", :count 2}
    {:type "emailsInterested", :user "usr_kCeLwjg9xcfcYa4nG", :count 2}
    {:type "emailsReplied", :user "usr_iZfJGa23wiwiCqjjH", :count 4}
    {:type "emailsSent", :user "usr_GCAf2NfN53yfuJWQm", :count 977}
    {:type "skipped", :user "usr_kN56zRMEuGHrccuxy", :count 163}
    {:type "linkedinInviteDone", :user "usr_GCAf2NfN53yfuJWQm", :count 363}
    {:type "emailsOpened", :user "usr_2MSdRxiwuytogvr4Y", :count 10}
    {:type "linkedinSent", :user "usr_ywbPXNoajoC7jByYb", :count 8}
    {:type "linkedinSent", :user "usr_2MSdRxiwuytogvr4Y", :count 3}
    {:type "manualNotInterested", :user "usr_ywbPXNoajoC7jByYb", :count 1}
    {:type "manualNotInterested", :user "usr_iZfJGa23wiwiCqjjH", :count 2}
    {:type "snoozed", :user nil, :count 1}
    {:type "linkedinOpened", :user "usr_ywbPXNoajoC7jByYb", :count 3}
    {:type "emailsUnsubscribed", :user "usr_kCeLwjg9xcfcYa4nG", :count 7}
    {:type "linkedinVisitDone", :user "usr_iZfJGa23wiwiCqjjH", :count 35}
    {:type "emailsOpened", :user "usr_fqzFxTz5DngDahXPE", :count 41}
    {:type "emailsNotInterested", :user "usr_uqgZEE4JteQEQ9YAZ", :count 6}
    {:type "emailsBounced", :user "usr_ywbPXNoajoC7jByYb", :count 2}
    {:type "emailsClicked", :user "usr_x9svQmwswqjctdMcp", :count 9}
    {:type "emailsSent", :user "usr_7oLRwJnEHXbsbyZbC", :count 1132}
    {:type "linkedinVisitFailed", :user "usr_iZfJGa23wiwiCqjjH", :count 1}
    {:type "emailsDone", :user "usr_uqgZEE4JteQEQ9YAZ", :count 6}
    {:type "linkedinInviteDone", :user "usr_fqzFxTz5DngDahXPE", :count 25}
    {:type "manualDone", :user "usr_kCeLwjg9xcfcYa4nG", :count 62}
    {:type "skipped", :user "usr_HHNHASpgiYBnRJupS", :count 1}
    {:type "linkedinReplied", :user "usr_7oLRwJnEHXbsbyZbC", :count 22}
    {:type "linkedinVisitDone", :user "usr_kCeLwjg9xcfcYa4nG", :count 127}
    {:type "emailsBounced", :user "usr_kN56zRMEuGHrccuxy", :count 100}
    {:type "emailsBounced", :user "usr_ZAFzAMbnbzuerskn6", :count 18}
    {:type "linkedinInviteDone", :user "usr_7oLRwJnEHXbsbyZbC", :count 241}
    {:type "manualDone", :user "usr_kN56zRMEuGHrccuxy", :count 87}
    {:type "conditionChosen", :user "usr_iZfJGa23wiwiCqjjH", :count 20}
    {:type "linkedinOpened", :user "usr_qNqwD8aE4CbyzWr3s", :count 3}
    {:type "manualDone", :user "usr_qNqwD8aE4CbyzWr3s", :count 8}
    {:type "emailsReplied", :user "usr_7oLRwJnEHXbsbyZbC", :count 6}
    {:type "emailsSent", :user "usr_vKK8EhG47mdn2YGwp", :count 1}
    {:type "paused", :user "usr_7oLRwJnEHXbsbyZbC", :count 317}
    {:type "conditionChosen", :user "usr_2MSdRxiwuytogvr4Y", :count 3}
    {:type "emailsClicked", :user "usr_kCeLwjg9xcfcYa4nG", :count 34}
    {:type "emailsSent", :user "usr_LeiW8oBTCpZZgjs72", :count 7}
    {:type "emailsSent", :user "usr_4Tq2hiZYvoPaaET46", :count 616}
    {:type "manualDone", :user "usr_ZAFzAMbnbzuerskn6", :count 1}
    {:type "linkedinInterested", :user "usr_GCAf2NfN53yfuJWQm", :count 2}
    {:type "paused", :user "usr_qNqwD8aE4CbyzWr3s", :count 14}
    {:type "emailsClicked", :user "usr_4Tq2hiZYvoPaaET46", :count 26}
    {:type "emailsNotInterested", :user "usr_ywbPXNoajoC7jByYb", :count 2}
    {:type "emailsInterested", :user "usr_uqgZEE4JteQEQ9YAZ", :count 4}
    {:type "emailsReplied", :user "usr_4Tq2hiZYvoPaaET46", :count 57}
    {:type "emailsOpened", :user "usr_qNqwD8aE4CbyzWr3s", :count 90}
    {:type "emailsSent", :user "usr_kN56zRMEuGHrccuxy", :count 760}
    {:type "linkedinSendFailed", :user "usr_fqzFxTz5DngDahXPE", :count 18}
    {:type "paused", :user "usr_iZfJGa23wiwiCqjjH", :count 3}
    {:type "annotated", :user nil, :count 60}
    {:type "emailsDone", :user "usr_ZAFzAMbnbzuerskn6", :count 16}
    {:type "linkedinInviteAccepted", :user "usr_kN56zRMEuGHrccuxy", :count 13}
    {:type "emailsBounced", :user "usr_fqzFxTz5DngDahXPE", :count 5}
    {:type "emailsBounced", :user "usr_qNqwD8aE4CbyzWr3s", :count 5}
    {:type "emailsReplied", :user "usr_qNqwD8aE4CbyzWr3s", :count 35}
    {:type "emailsClicked", :user "usr_ZAFzAMbnbzuerskn6", :count 1501}
    {:type "skipped", :user "usr_7oLRwJnEHXbsbyZbC", :count 344}
    {:type "emailsSent", :user "usr_BN98uhoTqHdwTiwhT", :count 141}
    {:type "skipped", :user "usr_uqgZEE4JteQEQ9YAZ", :count 76}
    {:type "skipped", :user "usr_fqzFxTz5DngDahXPE", :count 81}
    {:type "linkedinSent", :user "usr_kCeLwjg9xcfcYa4nG", :count 11}
    {:type "emailsClicked", :user "usr_7oLRwJnEHXbsbyZbC", :count 68}
    {:type "emailsClicked", :user "usr_qNqwD8aE4CbyzWr3s", :count 20}
    {:type "skipped", :user "usr_BN98uhoTqHdwTiwhT", :count 4}
    {:type "emailsFailed", :user "usr_ywbPXNoajoC7jByYb", :count 1}
    {:type "skipped", :user "usr_GCAf2NfN53yfuJWQm", :count 224}
    {:type "emailsUnsubscribed", :user "usr_4Tq2hiZYvoPaaET46", :count 8}
    {:type "resumed", :user "usr_ZAFzAMbnbzuerskn6", :count 1023}
    {:type "linkedinInviteDone", :user "usr_qNqwD8aE4CbyzWr3s", :count 14}
    {:type "linkedinSent", :user "usr_ZAFzAMbnbzuerskn6", :count 2}
    {:type "emailsDone", :user "usr_BN98uhoTqHdwTiwhT", :count 1}
    {:type "linkedinReplied", :user "usr_uqgZEE4JteQEQ9YAZ", :count 13}
    {:type "emailsOpened", :user "usr_ywbPXNoajoC7jByYb", :count 100}
    {:type "emailsReplied", :user "usr_uqgZEE4JteQEQ9YAZ", :count 33}
    {:type "emailsReplied", :user "usr_kN56zRMEuGHrccuxy", :count 5}
    {:type "linkedinInviteFailed", :user "usr_uqgZEE4JteQEQ9YAZ", :count 1}
    {:type "linkedinVisitDone", :user "usr_ZAFzAMbnbzuerskn6", :count 23}
    {:type "linkedinVisitDone", :user "usr_uqgZEE4JteQEQ9YAZ", :count 296}
    {:type "emailsClicked", :user "usr_uqgZEE4JteQEQ9YAZ", :count 50}
    {:type "linkedinInviteDone", :user "usr_ywbPXNoajoC7jByYb", :count 41}
    {:type "linkedinInviteAccepted", :user "usr_kCeLwjg9xcfcYa4nG", :count 14}
    {:type "linkedinVisitDone", :user "usr_HHNHASpgiYBnRJupS", :count 1}
    {:type "linkedinInviteDone", :user "usr_kN56zRMEuGHrccuxy", :count 63}
    {:type "emailsNotInterested", :user "usr_qNqwD8aE4CbyzWr3s", :count 1}
    {:type "emailsSent", :user "usr_373Av9HDcgCSj8b8d", :count 2}
    {:type "linkedinSent", :user "usr_kN56zRMEuGHrccuxy", :count 10}
    {:type "emailsNotInterested", :user "usr_GCAf2NfN53yfuJWQm", :count 5}
    {:type "emailsOpened", :user "usr_7oLRwJnEHXbsbyZbC", :count 218}
    {:type "linkedinDone", :user "usr_GCAf2NfN53yfuJWQm", :count 1}
    {:type "emailsInterested", :user "usr_GCAf2NfN53yfuJWQm", :count 1}
    {:type "linkedinInviteAccepted", :user "usr_7oLRwJnEHXbsbyZbC", :count 55}
    {:type "emailsClicked", :user "usr_iZfJGa23wiwiCqjjH", :count 43}
    {:type "emailsOpened", :user "usr_iZfJGa23wiwiCqjjH", :count 55}
    {:type "emailsBounced", :user "usr_7oLRwJnEHXbsbyZbC", :count 23}
    {:type "emailsSent", :user "usr_x9svQmwswqjctdMcp", :count 13}
    {:type "paused", :user "usr_GCAf2NfN53yfuJWQm", :count 7}
    {:type "emailsUnsubscribed", :user "usr_GCAf2NfN53yfuJWQm", :count 9}))

(def july-data
  '({:type "emailsSent", :user "usr_qNqwD8aE4CbyzWr3s", :count 12}
 {:type "emailsClicked", :user "usr_BN98uhoTqHdwTiwhT", :count 9}
 {:type "emailsReplied", :user "usr_ZAFzAMbnbzuerskn6", :count 11}
 {:type "linkedinOpened", :user "usr_kCeLwjg9xcfcYa4nG", :count 2}
 {:type "emailsClicked", :user "usr_GCAf2NfN53yfuJWQm", :count 54}
 {:type "emailsBounced", :user "usr_uqgZEE4JteQEQ9YAZ", :count 1}
 {:type "emailsUnsubscribed", :user "usr_ZAFzAMbnbzuerskn6", :count 5}
 {:type "linkedinSendFailed", :user "usr_4Tq2hiZYvoPaaET46", :count 36}
 {:type "emailsSent", :user "usr_fqzFxTz5DngDahXPE", :count 36}
 {:type "linkedinVisitDone", :user "usr_Jnns6MEdD5GcRubuQ", :count 14}
 {:type "emailsReplied", :user "usr_kCeLwjg9xcfcYa4nG", :count 2}
 {:type "emailsReplied", :user "usr_ywbPXNoajoC7jByYb", :count 2}
 {:type "linkedinInviteDone", :user "usr_Jnns6MEdD5GcRubuQ", :count 14}
 {:type "emailsOpened", :user "usr_GCAf2NfN53yfuJWQm", :count 165}
 {:type "emailsUnsubscribed", :user "usr_7oLRwJnEHXbsbyZbC", :count 2}
 {:type "linkedinSent", :user "usr_fqzFxTz5DngDahXPE", :count 3}
 {:type "linkedinVisitDone", :user "usr_ywbPXNoajoC7jByYb", :count 6}
 {:type "skipped", :user "usr_4Tq2hiZYvoPaaET46", :count 76}
 {:type "emailsOpened", :user "usr_uqgZEE4JteQEQ9YAZ", :count 13}
 {:type "linkedinInviteAccepted", :user "usr_qNqwD8aE4CbyzWr3s", :count 1}
 {:type "linkedinInviteAccepted", :user "usr_GCAf2NfN53yfuJWQm", :count 13}
 {:type "skipped", :user "usr_qNqwD8aE4CbyzWr3s", :count 4}
 {:type "conditionChosen", :user "usr_ywbPXNoajoC7jByYb", :count 5}
 {:type "linkedinVisitDone", :user "usr_4Tq2hiZYvoPaaET46", :count 40}
 {:type "emailsOpened", :user "usr_BN98uhoTqHdwTiwhT", :count 33}
 {:type "paused", :user "usr_kCeLwjg9xcfcYa4nG", :count 1}
 {:type "linkedinSent", :user "usr_7oLRwJnEHXbsbyZbC", :count 32}
 {:type "emailsSent", :user "usr_uqgZEE4JteQEQ9YAZ", :count 44}
 {:type "emailsReplied", :user "usr_LeiW8oBTCpZZgjs72", :count 2}
 {:type "manualDone", :user "usr_GCAf2NfN53yfuJWQm", :count 33}
 {:type "emailsOpened", :user "usr_kCeLwjg9xcfcYa4nG", :count 37}
 {:type "linkedinInviteAccepted", :user "usr_ywbPXNoajoC7jByYb", :count 1}
 {:type "linkedinInviteAccepted", :user "usr_4Tq2hiZYvoPaaET46", :count 1}
 {:type "emailsOpened", :user "usr_ZAFzAMbnbzuerskn6", :count 385}
 {:type "emailsDone", :user "usr_ywbPXNoajoC7jByYb", :count 1}
 {:type "paused", :user "usr_ZAFzAMbnbzuerskn6", :count 1}
 {:type "linkedinInviteAccepted", :user "usr_ZAFzAMbnbzuerskn6", :count 1}
 {:type "paused", :user nil, :count 4}
 {:type "emailsSent", :user "usr_ZAFzAMbnbzuerskn6", :count 523}
 {:type "emailsOpened", :user "usr_4Tq2hiZYvoPaaET46", :count 41}
 {:type "emailsUnsubscribed", :user "usr_fqzFxTz5DngDahXPE", :count 1}
 {:type "linkedinVisitDone", :user "usr_7oLRwJnEHXbsbyZbC", :count 12}
 {:type "emailsSent", :user "usr_kCeLwjg9xcfcYa4nG", :count 14}
 {:type "linkedinInviteDone", :user "usr_uqgZEE4JteQEQ9YAZ", :count 7}
 {:type "linkedinVisitDone", :user "usr_GCAf2NfN53yfuJWQm", :count 29}
 {:type "linkedinVisitDone", :user "usr_qNqwD8aE4CbyzWr3s", :count 1}
 {:type "emailsDone", :user "usr_qNqwD8aE4CbyzWr3s", :count 1}
 {:type "emailsSent", :user "usr_ywbPXNoajoC7jByYb", :count 38}
 {:type "emailsNotInterested", :user "usr_vKK8EhG47mdn2YGwp", :count 1}
 {:type "linkedinOpened", :user "usr_7oLRwJnEHXbsbyZbC", :count 4}
 {:type "linkedinSent", :user "usr_4Tq2hiZYvoPaaET46", :count 11}
 {:type "emailsInterested", :user "usr_qNqwD8aE4CbyzWr3s", :count 1}
 {:type "linkedinOpened", :user "usr_4Tq2hiZYvoPaaET46", :count 4}
 {:type "emailsDone", :user "usr_GCAf2NfN53yfuJWQm", :count 1}
 {:type "linkedinSendFailed", :user "usr_kCeLwjg9xcfcYa4nG", :count 1}
 {:type "emailsOpened", :user "usr_x9svQmwswqjctdMcp", :count 2}
 {:type "linkedinInviteAccepted", :user "usr_uqgZEE4JteQEQ9YAZ", :count 2}
 {:type "linkedinOpened", :user "usr_fqzFxTz5DngDahXPE", :count 1}
 {:type "emailsInterested", :user "usr_kCeLwjg9xcfcYa4nG", :count 2}
 {:type "emailsSent", :user "usr_GCAf2NfN53yfuJWQm", :count 173}
 {:type "linkedinInviteDone", :user "usr_GCAf2NfN53yfuJWQm", :count 29}
 {:type "linkedinSent", :user "usr_ywbPXNoajoC7jByYb", :count 1}
 {:type "linkedinOpened", :user "usr_ywbPXNoajoC7jByYb", :count 1}
 {:type "emailsUnsubscribed", :user "usr_kCeLwjg9xcfcYa4nG", :count 1}
 {:type "emailsOpened", :user "usr_fqzFxTz5DngDahXPE", :count 3}
 {:type "emailsSent", :user "usr_7oLRwJnEHXbsbyZbC", :count 324}
 {:type "linkedinReplied", :user "usr_7oLRwJnEHXbsbyZbC", :count 5}
 {:type "linkedinVisitDone", :user "usr_kCeLwjg9xcfcYa4nG", :count 3}
 {:type "emailsBounced", :user "usr_ZAFzAMbnbzuerskn6", :count 3}
 {:type "linkedinInviteDone", :user "usr_7oLRwJnEHXbsbyZbC", :count 6}
 {:type "conditionChosen", :user "usr_iZfJGa23wiwiCqjjH", :count 20}
 {:type "emailsReplied", :user "usr_7oLRwJnEHXbsbyZbC", :count 1}
 {:type "emailsClicked", :user "usr_kCeLwjg9xcfcYa4nG", :count 1}
 {:type "emailsSent", :user "usr_4Tq2hiZYvoPaaET46", :count 251}
 {:type "emailsClicked", :user "usr_4Tq2hiZYvoPaaET46", :count 5}
 {:type "emailsNotInterested", :user "usr_ywbPXNoajoC7jByYb", :count 1}
 {:type "emailsInterested", :user "usr_uqgZEE4JteQEQ9YAZ", :count 1}
 {:type "emailsReplied", :user "usr_4Tq2hiZYvoPaaET46", :count 17}
 {:type "emailsOpened", :user "usr_qNqwD8aE4CbyzWr3s", :count 9}
 {:type "emailsClicked", :user "usr_ZAFzAMbnbzuerskn6", :count 741}
 {:type "skipped", :user "usr_7oLRwJnEHXbsbyZbC", :count 132}
 {:type "emailsSent", :user "usr_BN98uhoTqHdwTiwhT", :count 27}
 {:type "skipped", :user "usr_fqzFxTz5DngDahXPE", :count 14}
 {:type "linkedinSent", :user "usr_kCeLwjg9xcfcYa4nG", :count 2}
 {:type "emailsClicked", :user "usr_7oLRwJnEHXbsbyZbC", :count 13}
 {:type "emailsClicked", :user "usr_qNqwD8aE4CbyzWr3s", :count 1}
 {:type "skipped", :user "usr_GCAf2NfN53yfuJWQm", :count 12}
 {:type "emailsUnsubscribed", :user "usr_4Tq2hiZYvoPaaET46", :count 3}
 {:type "resumed", :user "usr_ZAFzAMbnbzuerskn6", :count 1}
 {:type "linkedinInviteDone", :user "usr_qNqwD8aE4CbyzWr3s", :count 1}
 {:type "emailsDone", :user "usr_BN98uhoTqHdwTiwhT", :count 1}
 {:type "emailsOpened", :user "usr_ywbPXNoajoC7jByYb", :count 18}
 {:type "emailsReplied", :user "usr_uqgZEE4JteQEQ9YAZ", :count 1}
 {:type "linkedinVisitDone", :user "usr_uqgZEE4JteQEQ9YAZ", :count 4}
 {:type "linkedinInviteDone", :user "usr_ywbPXNoajoC7jByYb", :count 5}
 {:type "emailsOpened", :user "usr_7oLRwJnEHXbsbyZbC", :count 43}
 {:type "linkedinInviteAccepted", :user "usr_7oLRwJnEHXbsbyZbC", :count 4}
 {:type "emailsOpened", :user "usr_iZfJGa23wiwiCqjjH", :count 2}
 {:type "emailsBounced", :user "usr_7oLRwJnEHXbsbyZbC", :count 1}
 {:type "emailsUnsubscribed", :user "usr_GCAf2NfN53yfuJWQm", :count 1}))

(defn spec
  [data]
  {:mark {:type "bar", :tooltip {:content "data"}},
   :data {:values data}
   :encoding
   {"y" {:field :count, :type "quantitative"},
    "x" {:field :user :type "nominal"}
    "color" {:field :type , :type "nominal"}
;    "xOffset" {:field :type}
    }
   :width 1000
   :height 600
  })

(defn ui
  []
  [v/vega-view (spec july-data) []])
