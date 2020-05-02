# order-service-k8s-example

### Install minikube on windows 10:
[Installation guide: https://kubernetes.io/docs/tasks/tools/install-minikube/](https://kubernetes.io/docs/tasks/tools/install-minikube/ "https://kubernetes.io/docs/tasks/tools/install-minikube/")

##### Install  VirtualBox on windows 10:

- [VirtualBox](https://www.virtualbox.org/wiki/Downloads  "VirtualBox")

##### Install and setup kubectl [Install kubectl](https://kubernetes.io/docs/tasks/tools/install-kubectl/ "Install kubectl")

a)	Install kubectl  from below link.
[https://storage.googleapis.com/kubernetes-release/release/v1.13.0/bin/windows/amd64/kubectl.exe](https://storage.googleapis.com/kubernetes-release/release/v1.13.0/bin/windows/amd64/kubectl.exe "https://storage.googleapis.com/kubernetes-release/release/v1.13.0/bin/windows/amd64/kubectl.exe")
and then add the binary to your class PATH.

##### Minikube installation on windows:
Manual installation: 
 1.   To install Minikube manually on Windows, download minikube-windows-amd64, rename it to minikube.exe, and add it to your class path.
 2.  using Windows Installer, download minikube-installer.exe and execute the installer [download](https://github.com/kubernetes/minikube/releases/latest "download")
 
#####  Install Docker Tool Box:
[download](https://docs.docker.com/toolbox/toolbox_install_windows/ "download") docker tool box and install it. Please uncheck virtual box option while installing docker tool box. 

#####  Run Minikube: 
1.  Go to command prompt and run below command.
`C:\Windows\System32> minikube start -p test_vm123 --vm-driver=virtualbox `
2. It should start minikube successfully! 
3.  open dashboard `minikube dashboard test_vm123 `

##### Commands to run order-service
1. Role binding
`kubectl create clusterrolebinding admin --clusterrole=cluster-admin --serviceaccount=default:default`
2. apply yours configuration files:
a) `kubectl apply -f K8s-Configs\db-configmap.yml`
b) `kubectl apply -f K8s-Configs\db-secret.yml`
c) `kubectl apply -f K8s-Configs\order-service-deployment.yml`
d)`kubectl apply -f K8s-Configs\order-service-ingress.yml`
3.  build
`docker build -t med/order-service:1.0 .`

4. `kubectl run order-service --image=med/order-service:1.0 \ --port=8080 --image-pull-policy Never`





 



