# Introduction

With Paradym, you can set up digital identity infrastructure in minutes, so you can focus on integrating it into your application. The Paradym connector allows you to easily and quickly connect with the Paradym API for issuing, verifying and other identity actions in Mendix.

This Paradym connector enables the usage of most of the Paradym API resources described in API documentation https://paradym.id/reference?full and is up to date with [Changelog April 11, 2025](https://paradym.id/changelog)

# Development

The connector_paradym module requires at least Mendix version [9.24.18](https://marketplace.mendix.com/link/studiopro/9.24.18).

## Maintenance

This module is maintained in this GitHub repository

## Dependencies

- [CommunityCommons](https://marketplace.mendix.com/link/component/170)
- [REST_Responses](https://marketplace.mendix.com/link/component/118687)
- [Encryption](https://marketplace.mendix.com/link/component/1011)
- [JSONPath](https://marketplace.mendix.com/link/component/107685)

## Issues

Please report any issues with the Paradym connector on [GitHub](https://github.com/Entidad/connector_paradym/issues).

# Documentation

This module supports [Paradym API v1](https://paradym.id/reference?full) which contains the following endpoints
Supported API endpoints:

```
/v1
    /projects
        /members
            /add
            /remove
        /webhooks
        /profiles/default
        /templates
            /credentials
                /sd-jwt-vc
                    /json-schema
                    /unarchive
                /anoncreds
                    /json-schema
                    /unarchive
            /presentations
        /dids
        /trusted-entities
        /issuance
            /sd-jwt-vc
        /revocation/batch
        /openid4vc
            /issuance
                /offer
            /verification
                /request
        /didcomm
            /invitations
                /receive
                /create-connection
            /connections
            /issuance
                /offer
            /verification
                /request
            /mediators
                /connections
            /messaging
                /basic/send
                /custom/send
```

API and Dashboard: Use Paradym to issue and verify credentials (SD-JWT over OpenID4VC and DIDComm based)


## Configuration

Please start with the Paradym documentation to get familiar with concepts of digital wallets, the workflows, actions and executions.

1. Create an account with Paradym, obtain an API key
1. Download connector_paradym from the Mendix Marketplace (or import it manually) into Studio Pro
1. Connect the Administrator (module role) to a User role and add the Paradym Settings snippet on an overview accessible by the user setting up the Paradym connector
1. Set Constants
1. Add logic to create/edit/delete APISettings by using theA PISettingsHelper and open the APISettings_Edit (it's up to you to decide how to determine the _IDs)
1. Add logic to create Projects (optional, can also be done via the Paradym dashboard)
1. Run the application, sign in and go to the Paradym settings page
1. Create APISettings, enter your API key and start syncing data from Paradym (at this point there won't be much data, but if you are connection with an existing API key you can retrieve existing projects, mediators, etc.)
1. Start building with the components of connector_paradym

To further test and work with Paradym API actions it is recommended to use a gateway that can forward the webhook events to your local development machine (e.g. hookdeck, ngrok).

## Security

This module tries to follow the principle of least privilege, in which a user is given the minimum levels of access needed. 

- Module roles: Administrator role for configuring the Paradym connector and debugging information. No other users should have access to logic or data from this module.
- Encryption: always store sensitive and personal information encrypted (e.g. ApiKey, proof-presentations, messages).

# References

- [Farmworker Wallet OS](https://tac.openwallet.foundation/projects/fwos/) ecosystem. Although `connector_paradym` is not part of the Farmworker Wallet OS it is used in the reference projects to demonstrate how a Cloud Agent implementation with Mendix could be developed
- [Paradym default workflows](https://github.com/Entidad/paradym-default-workflows). The Paradym documentation contains some example workflows, this repository contains the workflows definitions used as starting point for Entidad projects implementing Paradym (archived)