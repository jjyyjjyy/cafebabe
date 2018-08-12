#!/bin/bash

KUBE_VER="v1.11.2"
images=(
kube-proxy-amd64:`${KUBE_VER}`
kube-scheduler-amd64:`${KUBE_VER}`
kube-controller-manager-amd64:`${KUBE_VER}`
kube-apiserver-amd64:`${KUBE_VER}`
etcd-amd64:3.2.18
pause:3.1
coredns:1.1.3
)
for imageName in ${images[@]} ; do
  docker pull registry.cn-hangzhou.aliyuncs.com/google_containers/$imageName
  docker tag registry.cn-hangzhou.aliyuncs.com/google_containers/$imageName k8s.gcr.io/$imageName
  docker rmi registry.cn-hangzhou.aliyuncs.com/google_containers/$imageName
done
